public classRectangle {
 public intlength;
 public int width;
 publicRectangle(intlength,int width) {
 this.length = length;
 this.width = width;
 }
 public int getArea() {
 return length * width;
 }
 public int getPerimeter() {
 return 2 * (length + width);
 }
}
