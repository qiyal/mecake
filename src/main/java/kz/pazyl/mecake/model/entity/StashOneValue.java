package kz.pazyl.mecake.model.entity;

import kz.pazyl.mecake.model.enums.StashActions;

public class StashOneValue {
    private Long id;
    private Double value;
    private Currency currency;
    private StashActions actionType;
    private String note;
    private User owner;

    //TODO
    // дата создание
    // дата удаление
}
