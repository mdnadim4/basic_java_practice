public class assignment_1 {

    public static void main(String[] args) {

        String str = "Your trnx is successful. Trnx Id is: TXN123456";
        String txnID = str.substring(str.indexOf("TXN123456"));
        System.out.println("Transaction ID is: " + txnID);

    }

}
