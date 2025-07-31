package Lib;

import javax.management.RuntimeErrorException;

/**
 * ADT ที่ไม่เปลี่ยนรูป(Immutable) สำหรับเก็บข้อมูลสินค้า
 * คลาสนี้เป็น final เพื่อป้องกันการสืบทอดและรับประกัน Immutability 
 */

public class Product {
    private final String productId ;
    private final String productName;
    private final double price  ;
    // Rep Invariant (RI):
    // - productId and productName are not null or blak
    // - price >= 0 
    //
    //Abstraction Function (AF):
    // - AF (productId , productName ,price) = A product with the given ID , name and price.
    
    /**
     * ตรวจสอบว่า Rep Invariant เป็นจริงหรือไม่
     */
      private void checkRep(){
        if (productId == null || productId.isBlank()){
            throw new RuntimeException("RI violated : productID cannot br blank.");
        }
        if(productName == null || productName.isBlank()){
            throw new RuntimeException("RI violated : productName cannot br blank. ");
        }
        if(price < 0){
          throw new RuntimeException("RI violated : price cannot br blank. ");
        }
      }
      /**
       * สร้างอ็อบเจกต์ Product
       * @param productId  รหัสสินค้า ห้ามเป็นคำว่าง
       * @param product  ชื่อสินค้า ห้ามเป็นคำว่าง
       * @param price ราคา ไม่ติดลบ
       */


     public Product(String productId , String productName , double price){
        this.productId = productId ;
        this.productName = productName ;
        this.price = price ;
        checkRep(); //ตรวจสอบความถูกต้องทุกครั้งที่สร้าง
     }
     public String getProductId() {return productId ;}

     public String getProductName() {return productName ;}

     public double getPrice() {return price ;}

     /**
      * เปรียบเทียบ Product สองชิ้นโดยใช้ ProductId
      * @param obj อ็อบเจกต์ที่ต้องการเปรียบเทียบ
      * @return true หาก productId เหมือน
      */
   
    public boolean equals(Object obj){
        if (this == obj) return true ;
        if (obj == null || getClass() != obj.getClass()) return false  ;
        Product product = (Product) obj ;
        return productId.equals(product.productId);

    }



}

