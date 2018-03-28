package Test;

import DBAccess.BrickMapper;
import DBAccess.OrderMapper;
import DBAccess.UserMapper;
import FunctionLayer.Calculation;
import FunctionLayer.Employee;
import FunctionLayer.PreOrder;
import PresentationLayer.EmployeePage;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author malik
 */
public class Main 
{
    public static void main(String[] args) throws ClassNotFoundException, SQLException 
    {
//        Calculation c = new Calculation();
//        //int res = c.brickTotalBottom(20);
//        System.out.println("Bottom " + c.brickTotalBottom(20));
//        System.out.println("Above bottom " + c.brickTotalOverBottom(20));
//        
//        BrickMapper brick = new BrickMapper();
//        System.out.println("\n\nAll " + brick.getAllBottoms());
//        
//        System.out.println("... " + brick.totalLength("big"));
        
//        OrderMapper om = new OrderMapper();
//        
//        ArrayList<Integer> orderID = new ArrayList<>();
//        Employee emp = new Employee();
//        
//        emp.idList();
//        
//        System.out.println(emp.getOrderID().toString().replace("[","").replace("]","").replace(",",""));
//        orderID = om.getAllOrders();
//      //  om.sendOrder(2);
//        
//        for (int i = 0; i < orderID.size(); i++) {
//            System.out.println(orderID.get(i));
//        }
//        
        Calculation c = new Calculation();
        UserMapper um = new UserMapper();
        
        System.out.println("user: " + um.getUse(1));
        
        OrderMapper om = new OrderMapper();
        PreOrder o = new PreOrder(1, 10, 10, 2);
        om.createPreOrder(o);
        System.out.println("\nTotal: " + c.totalBricks(o));
        
        System.out.println("\n\n");
        System.out.println("Order history " + om.History(o));
        System.out.println("\n\n");
              
        BrickMapper brick = new BrickMapper();
        System.out.println("\n\nAll " + brick.getAllBottoms());
        
        System.out.println("... " + brick.totalLength("small"));
        
    }
}
