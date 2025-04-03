package ticket.booking.entities;


public class Ticket {

        private String ticketId;
        private String userId;
        private String sourceName;
        private String destinationName;
        private String dateOfTravel;
        private Train train;

        // parameterized constructor
        public Ticket(String ticketId, String userId, String sourceName, String destinationName, String dateOftravel,
                        Train train) {
                this.ticketId = ticketId;
                this.userId = userId;
                this.sourceName = sourceName;
                this.destinationName = destinationName;
                this.dateOfTravel = dateOftravel;
                this.train = train;
        }

        // default constructor
        public Ticket() {
        };

        // getters and setters for each variable
        public String getticketId() {
                return this.ticketId;
        }

        public void setticketId(String ticketId) {
                this.ticketId = ticketId;
        }

        public String getuserId() {
                return this.userId;
        }

        public void setuserId(String userId) {
                this.userId = userId;
        }

        public String getsourceName() {
                return this.sourceName;
        }

        public void setsourceName(String sourceName) {
                this.sourceName = sourceName;
        }

        public String getdestinationName() {
                return this.destinationName;
        }

        public void setdestinationName(String destinationName) {
                this.destinationName = destinationName;
        }

        public String getdateOfTravel() {
                return this.dateOfTravel;
        }

        public void setdateOfTravel(String dateOfTravel) {
                this.dateOfTravel = dateOfTravel;
        }

        public Train gettrain() {
                return this.train;
        }

        public void settrain(Train train) {
                this.train = train;
        }

        public String getTicketInfo() {
                return String.format("Ticket ID: %s belongs to User %s from %s to %s on %s", ticketId, userId,
                                sourceName, destinationName, dateOfTravel);
        }

}
