package responsibilitychainpattern;

import java.util.Arrays;

public class HandlerUtil {

    public static HandlerEntity getFirstHandlerEntity(){
        for (HandlerEnum handlerEnum : HandlerEnum.values()) {
            HandlerEntity handlerEntity = handlerEnum.getHandlerEntity();
            if (handlerEntity.getPreHandlerId() == null) {
                return handlerEntity;
            }
        }
        return null;
    }

    public static HandlerEntity getHandlerEntityByHandlerId(Integer id){
        HandlerEnum handlerEnum = Arrays.stream(HandlerEnum.values()).filter(h -> h.getHandlerEntity().getId().equals(id)).findFirst().orElse(null);
        if(handlerEnum!=null){
            return handlerEnum.getHandlerEntity();
        }
        return null;
    }
}
