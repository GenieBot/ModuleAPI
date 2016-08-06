package io.sponges.bot.api.entities.message;

public interface ReceivedMessage {

    void delete() throws CannotDeleteException;

    class CannotDeleteException extends Exception {

        private final String message;

        protected CannotDeleteException(String message) {
            this.message = message;
        }

        @Override
        public String getMessage() {
            return message;
        }
    }

}
