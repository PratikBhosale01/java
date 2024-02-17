///*
// * Author : Pratik Bhosale
// * Date : $(DATE)
// * created with : IntelliJ IDEA Community Edition
// */
//import com.fasterxml.jackson.databind.ObjectMapper;
//@JsonIgnoreProperties(ignoreUnknown = true) //this for some properties are missing we can mapper.configure methods also
//class Laptop{
//    private String brand;
//
//    private String model;
//
//    @Override
//    public String toString() {
//        return "Laptop{" +
//                "brand='" + brand + '\'' +
//                ", model='" + model + '\'' +
//                '}';
//    }
//
//    public String getBrand() {
//        return brand;
//    }
//
//    public void setBrand(String brand) {
//        this.brand = brand;
//    }
//
//    public String getModel() {
//        return model;
//    }
//
//    public void setModel(String model) {
//        this.model = model;
//    }
//}
//
//
//public class Jackson {
//    //In spring boot this conversation is done in background with help spring web dependencies
//    public static void main(String[] args) {
//
//        String json ="{\"brand\":\"Abc\",\"model\":\"XYZ\"}";
//
//        try {
//            // Create ObjectMapper instance
//            ObjectMapper objectMapper = new ObjectMapper();
//
//            // Convert JSON string to Java object
//            Laptop lap = objectMapper.readValue(json, Laptop.class);
//
//            // Print Java object
//            System.out.println(lap);
//        } catch (Exception e) {
//
//            e.printStackTrace();
//        }
//    }
//}
