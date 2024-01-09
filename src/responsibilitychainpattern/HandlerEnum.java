package responsibilitychainpattern;

public enum HandlerEnum {
    FIRST_PASS_HANDLER(new HandlerEntity(1,"第一关","responsibilitychainpattern.FirstPassHandler",null,2))
    ,SECOND_PASS_HANDLER(new HandlerEntity(2,"第二关","responsibilitychainpattern.SecondPassHandler",1,3))
    ,OTHER_PASS_HANDLER(new HandlerEntity(3,"第三关","responsibilitychainpattern.OtherPassHandler",2,4))
    ,THIRD_PASS_HANDLER(new HandlerEntity(4,"最后一关","responsibilitychainpattern.ThirdPassHandler",3,null))
    ;

    HandlerEntity handlerEntity;

    HandlerEnum(HandlerEntity handlerEntity) {
        this.handlerEntity = handlerEntity;
    }

    public HandlerEntity getHandlerEntity() {
        return handlerEntity;
    }




}
