import java.util.*;
import java.util.stream.Collectors;

class Invoice {
    String transactionId;
    Invoice(String transactionId) {
        this.transactionId = transactionId;
    }
    public String toString() {
        return "Invoice for Transaction: " + transactionId;
    }
}

public class InvoiceGenerator {
    public static void main(String[] args) {
        List<String> transactionIds = Arrays.asList("TXN1001", "TXN1002", "TXN1003");

        List<Invoice> invoices = transactionIds.stream()
                                               .map(Invoice::new) // constructor reference
                                               .collect(Collectors.toList());

        invoices.forEach(System.out::println);
    }
}
