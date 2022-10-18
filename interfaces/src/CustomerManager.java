public class CustomerManager {

    private ICustomerDal customerDal; //Dışarıdan erişimini engellemek için private kullan.

    public CustomerManager(ICustomerDal customerDal){ //
        this.customerDal=customerDal;
    }
    public void add() {
        //İş Kodları
        customerDal.add();

    }
}
