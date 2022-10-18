public class CustomerManager {
    BaseDatabaseManager databaseManager;
    //base sınıf strateji görevini görür. Hangi database verilirse onun getDatası çalışır.

    public void getCustomers(){
        databaseManager.getData();

    }
}
