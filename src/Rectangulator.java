public classRectangulator {
 public static voidmain(String[] args) {
 intlength = Integer.parseInt(args[0]);
 int width = Integer.parseInt(args[1]);
 Rectangle myRectangle = new Rectangle(length, width);
 Stringoutput = String.format("*** YourRectangle ***\n\nLength: %d\nWidth: %d\nArea: %d\nPerimeter: %d\n\n",
myRectangle.length, myRectangle.width, myRectangle.getArea(), myRectangle.getPerimeter());
 System.out.println(output);
 }
}
