package api.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;

@WebServlet("/sumup")
public class CountMoneyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        product product = new product();
        order order  =new  order();
        user user = new user();
        transaction tran = new transaction();

        user.setId("1");
        user.setName("Giff");
        user.setSurname("Sriti");


        product.setId("007");
        product.setName("CoCo");
        product.setPrice(55.00f);

        order.setDay("17/15/8");
        order.setId("006");
        order.setPrice(56.00f);
        order.setName("shop");
        order.setStatus("successfull");
        order.setFee("1");

        tran.setShopname("coppee");
        tran.setPrice(55.00f);
        tran.setId("1");
        tran.setDaytran("17/8/25");
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(resp.getOutputStream(), user);
        mapper.writeValue(resp.getOutputStream(), product);
        mapper.writeValue(resp.getOutputStream(), order);
    }

}





class user {
    private String id;
    private String name;
    private String surname;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}


class product {
    private String id;
    private String name;
    private float price;
    private String  day;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
}


class order {
    private String id;
    private String name;
    private float price;
    private String  day;
    private String fee;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private String status;
    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
}

class transaction{
    private String id;
    private String shopname;
    private float price;
    private String daytran;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDaytran() {
        return daytran;
    }

    public void setDaytran(String daytran) {
        this.daytran = daytran;
    }
}


