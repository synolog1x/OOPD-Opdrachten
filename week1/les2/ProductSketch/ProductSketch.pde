class Product {
  String naam;
  int prijs;




  //constructor
  Product(String productNaam, int productPrijs) {
    this.naam = productNaam;
    this.prijs = productPrijs;
  }
}

void setup() {

  Product product1 = new Product("pc", 500);
  Product product2 = new Product("mac", 2000);



  Product[] productInformatie = {product1, product2};


  println(productInformatieAfdruk(productInformatie));
}



String[] productInformatieAfdruk(Product[] productInformatie) {
  String[] uitvoer = new String[productInformatie.length];
  for (int i = 0; i < productInformatie.length; i++) {
    uitvoer[i] = productInformatie[i].naam + " kost " + productInformatie[i].prijs + " Euro\n";
  }


  return uitvoer;
}