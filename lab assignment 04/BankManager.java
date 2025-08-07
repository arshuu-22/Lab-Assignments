public class BankManager {
    String bankName;
    String branchName;  

    public BankManager(String bankName, String branchName) {
        this.bankName = bankName;
        this.branchName = branchName;
    }
    public String getBankName() {   
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    public String getBranchName() {
        return branchName;
    }
    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }
    public void countmoney() {
        System.out.println("Counting money at " + bankName + ", " + branchName + ".");
    }
    public void Aproveloan() {
        System.out.println("Approving loans at " + bankName + ", " + branchName + ".");
    }

    public void show() {
        System.out.println("I am the manager of " + bankName + " at " + branchName + ".");
    }

    
}
