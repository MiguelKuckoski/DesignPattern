package design_pattern.estrutural.proxy;

public class RealImage extends Image{
    private String filename;
    
    public RealImage(String filename) { 
        this.filename = filename;
        loadImageFromDisk();
    }
 
    private void loadImageFromDisk() {
        System.out.println("Loading   " + filename);
    }
 
    @Override
    public void displayImage() { 
        System.out.println("Displaying " + filename); 
    }

}
