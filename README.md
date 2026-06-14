# java-
exceptions:
--> porque as excessoes tem classes, ainda n entendo isso espero que esse conhecimento n seja 
tao importante na pratica (com certeza é)

1-->

try{
    //codigo perigoso
}catch(){
    //tratamento da exceçao
}catch(){

}...
finally{

}


----------

try{
    int a = 10/0;
}catch(ArithmeticException e){
    System.out.print(e.getMessage());
}

---> se e é um objeto eu posso usar o metodo getMessage
mas qual a classe do objeto?



---------
THROW --> lançar uma exceçao manualmente

throw --> gera/dispara um erro
try/catch --> captura um erro e o trata

