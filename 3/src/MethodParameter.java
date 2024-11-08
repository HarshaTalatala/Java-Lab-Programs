class Box{
    double width,height,depth;
    double volume(){
        return width*height*depth;
    }
    void setDim(double w,double h,double d){
        width = w;
        height = h;
        depth = d;
    }
}

class MethodParameter {
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box();
        b1.setDim(2.34,3.45,4.56);
        b2.setDim(3.45,4.56,5.67);
        System.out.println("Volume 1 : "+b1.volume());
        System.out.println("Volume 2 : "+b2.volume());
    }
}
