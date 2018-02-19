Slider s1;

void setup() {
  size(300, 200);
  background(0);

  s1 = new Slider();
}

void draw() {
  s1.bepaalPositie();
  s1.teken();
  println(s1);
}