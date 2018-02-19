Dambord dambord = new Dambord(50);

void setup() {
  size(500, 500);
  smooth(10);
}


void draw() {
  background(200);
 dambord.tekenDamstenen();

}

void mouseClicked() {
dambord.selecteerDamsteen();
}