package ir.maktabExcersice.controlls;
import ir.maktabExcersice.models.Customer;
import ir.maktabExcersice.repositories.CustomerRepositoryImpl;
import ir.maktabExcersice.services.CustomerServiceImpel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value ="/customer")
public class CustomerController {
@Autowired
CustomerServiceImpel customerServiceImpel;
    @RequestMapping(value={"/",""})
    public String inHome(){
        return "homePage";
    }
    @RequestMapping(value = "/growFunction")
    public ModelAndView growFunction() {
        ModelAndView modelAndView=new ModelAndView("customer");
        modelAndView.addObject("firstName","PADINA");
        modelAndView.addObject("lastName","SHAHVALI");
        modelAndView.addObject("email","sendforbest@yahoo.com");
        return modelAndView;
    }
    @RequestMapping(value = "/customerlist")
    public String customerList(Model model){

        List<Customer> customerList = customerServiceImpel.getCustomerList();
        model.addAttribute("customerList",customerList);

        return "customerListView";
    }
    @RequestMapping(value = "/create")
    public String createCustomer(){
        Customer customer=new Customer();
        customer.setEmail("maktab@yahoo.com");
        customer.setFirstName("meysam");
        customer.setLastName("kohshoori");
        customerServiceImpel.createCustomer(customer);
        return "homePage";
    }
}
