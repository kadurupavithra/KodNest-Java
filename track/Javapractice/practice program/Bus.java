import java.util.Scanner;

public class Bus {
    class Money {

    }

    class Ticket {

    }

    class Conductor {
        void collect(Money m) {
            System.out.println("money is collected from the passenger");
        }

        Ticket issueTicket{
        
            Ticket t = new Ticket();
            return t;
        }
    }

    class passenger {
        public static void main(String[] args) {
            Conductor c = new Conductor();
            Money m = new Money();
            c.collect(m);
            Ticket t = c.issueTicket();
            System.out.println(t);
            if (t == null) {
                System.out.println("Ticket is not issued");
            } else {
                System.out.println("Ticket is issued");
            }

        }
}