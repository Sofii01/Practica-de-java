package JavaSEPOO.MyMedicalAppointments;

public class Patient extends User{

    private String birthday;
    private Double weight;
    private Double height;
    private String blood;

    Patient (String name, String email){
        super(name, email);
    }


    /**
     * @return the birthday
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * @param birthday the birthday to set
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    /**
     * @return the weight
     */
    public String getWeight() {
    
        return weight + " Kg.";
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(Double weight) {
        this.weight = weight;
        
    }

    /**
     * @return the height
     */
    public Double getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(Double height) {
        this.height = height;
        
    }

    /**
     * @return the blood
     */
    public String getBlood() {
        return blood;
    }

    /**
     * @param blood the blood to set
     */
    public void setBlood(String blood) {
        this.blood = blood;
    }
    @Override
    public String toString() {
        
        return super.toString()+ "\nAge: "+birthday+ "\nWeight: "+ 
          getWeight()+ "\nHeight: "+getHeight()+ "\nBlood: "+blood;
    }

}
