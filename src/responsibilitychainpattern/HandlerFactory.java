package responsibilitychainpattern;

import org.omg.CORBA.PUBLIC_MEMBER;

public class HandlerFactory {

    public static PassHandler getFirstHandler() {
        HandlerEntity firstHandlerEntity = HandlerUtil.getFirstHandlerEntity();
        PassHandler firstHandler = newPassHandler(firstHandlerEntity);
        if (firstHandler == null) {
            return null;
        }

        HandlerEntity temEntity = firstHandlerEntity;
        Integer nextHandlerId = null;
        PassHandler tempPassHandler = firstHandler;

        while ((nextHandlerId = temEntity.getNextHandlerId())!=null){
            HandlerEntity nextHandlerEty = HandlerUtil.getHandlerEntityByHandlerId(nextHandlerId);
            PassHandler nextPassHandler = newPassHandler(nextHandlerEty);
            tempPassHandler.setNextHandler(nextPassHandler);
            tempPassHandler = nextPassHandler;
            temEntity = nextHandlerEty;
        }

        return firstHandler;

    }

    public static PassHandler newPassHandler(HandlerEntity entity) {
        if (entity == null) {
            return null;
        }
        String className = entity.getConference();
        try {
            Class<?> clazz = Class.forName(className);
            return (PassHandler) clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
