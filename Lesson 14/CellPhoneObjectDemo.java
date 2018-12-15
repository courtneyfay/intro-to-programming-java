public class CellPhoneObjectDemo
{
   public static void main(String[] args)
   {
      //Declare a variable that can reference
      //a CellPhone object
      CellPhone myPhone;
      
      //The following statement creates an object
      //using the CellPhone class as its blueprint.
      //The myPhone variable will reference the object.
      myPhone = new CellPhone();
      
      //Store values in the object's fields.
      myPhone.setManufacturer("Motorola");
      myPhone.setModelNumber("M1000");
      myPhone.setRetailPrice(199.99);
      
      //Display the values stored in the fields.
      System.out.println("The manufacturer is " + myPhone.getManufacturer());
      System.out.println("The model number is " + myPhone.getModelNumber());
      System.out.println("The retail price is " + myPhone.getRetailPrice());
   }
}