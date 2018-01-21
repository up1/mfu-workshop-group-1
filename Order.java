public class Order{
    private int orderId;
    private int productId;
    private String productName;
    private int Id;
    private String status;
    private int amount;

    public int getOrderId(){
        return orderId;
    }

    public void setOrderId(int orderId){
        this.orderId = orderId;
    }

    public int getProductName(){
        return productName;
    }

    public void setProductName(String productName){
        this.productName = productName;
    }  

    public int getProductId(){
        return productId;
    }

    public void setProductId(int productId){
        this.productId = productId;
    }  

    public int getUserId(){
        return Id;
    }

    public void setUserId(int Id){
        this.Id = Id;
    }
    
    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }
    public int getAmount(){
        return amount;
    }

    public void setAmount(int amount){
        this.amount = amount;
    }
}