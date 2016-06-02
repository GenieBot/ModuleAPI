package io.sponges.bot.api.entities.data;

import java.util.Date;
import java.util.Optional;

public interface ClientData {

    Optional<String> getName();

    Optional<Date> getConnectedDate();

}
