package org.example.event_listener.listener;

import org.example.event_listener.model.listener.EntityEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EntityListener {

    @EventListener(condition = "#root.args[0].accessType.name() == 'READ'")
    public void listenRead(EntityEvent event) {
        System.out.println("m6LgO9Pu :: read listen event: " + event);
    }

    @EventListener(condition = "#root.args[0].accessType.name() == 'CREATE'")
    public void listenCreate(EntityEvent event) {
        System.out.println("L5bG0XOm :: create li1sten event: " + event);
    }

}
