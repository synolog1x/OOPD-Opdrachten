Klok deKlok;

void setup(){
size(400,300);
deKlok = new Klok(150,100,200);
deKlok.setTijd(23,58);



}

void draw(){
background(255);
deKlok.tik();
deKlok.tekenKlok();
println(deKlok);
}