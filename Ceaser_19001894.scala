
object CeasarCipher extends App{

	val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val key = (scala.io.StdIn.readLine("Enter the shift:\nIf you want to encrypt enter positive shifts\nIf you want to decrypt enter negative shifts ").toInt + alphabet.size) % alphabet.size
    val inputSecretmsg = scala.io.StdIn.readLine("Enter The Secret Message: ")
	val outputSecretmsg = inputSecretmsg.map( (c: Char) => { 

		val x = alphabet.indexOf(c.toUpper)
		if (x == -1){
			c
		}
		else{
			alphabet((x + key) % alphabet.size)
			} 
	});

	
	println(outputSecretmsg);
}