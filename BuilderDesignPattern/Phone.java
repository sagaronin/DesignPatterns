package BuilderDesignPattern;

public class Phone {

    // Mandatory fields
    private String operatingSystem;
    private String brandName;

    // Optional Fields
    private String modelName;
    private double price;
    private float height;
    private float length;

    // Setter methods to set data into member variables
    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setLength(float length) {
        this.length = length;
    }

    // Getter methods to get data from member variables
    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getModelName() {
        return modelName;
    }

    public double getPrice() {
        return price;
    }

    public float getHeight() {
        return height;
    }

    public float getLength() {
        return length;
    }

    // Private Constructor for building phone
    private Phone(PhoneBuilder phoneBuilder) {
        this.operatingSystem = phoneBuilder.operatingSystem;
        this.brandName = phoneBuilder.brandName;
        this.modelName = phoneBuilder.modelName;
        this.price = phoneBuilder.price;
        this.height = phoneBuilder.height;
        this.length = phoneBuilder.length;
    }

    @Override
    public String toString() {
        return "Phone [operatingSystem=" + operatingSystem + ", brandName=" + brandName + ", modelName=" + modelName
                + ", price=" + price + ", height=" + height + ", length=" + length + "]";
    }

    public static class PhoneBuilder {
        // Mandatory fields
        private String operatingSystem;
        private String brandName;

        // Optional Fields
        private String modelName;
        private double price;
        private float height;
        private float length;

        // This constructor only accepts mandatory variables
        public PhoneBuilder(String operatingSystem, String brandName) {
            this.operatingSystem = operatingSystem;
            this.brandName = brandName;
        }

        // Public setters for optional fields
        // Note: Make sure to return "this" as you would want to chain it
        public PhoneBuilder setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }

        public PhoneBuilder setPrice(double price) {
            this.price = price;
            return this;
        }

        public PhoneBuilder setHeight(float height) {
            this.height = height;
            return this;
        }

        public PhoneBuilder setLength(float length) {
            this.length = length;
            return this;
        }

        public Phone build() {
            return new Phone(this);
        }

    }

}
