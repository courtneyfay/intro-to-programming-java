public class CellPhone
{
   //Field declarations
   private String manufacturer;
   private String modelNumber;
   private double retailPrice;
   
   //Constructor
   public CellPhone(String manufact, String modNum, double retail)
   {
      manufacturer = manufact;
      modelNumber = modNum;
      retailPrice = retail;
   }
   
   //Mutator methods
   public void setManufacturer(String manufact)
   {
      manufacturer = manufact;
   }
   
   public void setModelNumber(String modNum)
   {
      modelNumber = modNum;
   }
   
   public void setRetailPrice(double retail)
   {
      retailPrice = retail;
   }
   
   //Accessor methods
   public String getManufacturer()
   {
      return manufacturer;
   }
   
   public String getModelNumber()
   {
      return modelNumber;
   }
   
   public double getRetailPrice()
   {
      return retailPrice;
   }
}