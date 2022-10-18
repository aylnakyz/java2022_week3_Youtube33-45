public class Main {
    public static void main(String[] args) {
        //ICustomerDal customerDal= new OracleCustomerDal();
        //customerDal OracleCustomerDal ın referansını tutar.

        CustomerManager customerManager=new CustomerManager(new SqlServerDal());
        //customerManager.customerDal=new OracleCustomerDal();
        //customerManager.customerDal=new MySqlCustomerDal();
        //customerManager.customerDal=new SqlServerDal();
        customerManager.add();
    }
}