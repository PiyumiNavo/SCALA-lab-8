@main def main():Unit = println(caesarCipher("university",1,encryption))

def caesarCipher(text:String,shift:Int,method:(String,Int)=>String) = method(text,shift)


def encryption(word: String, shift: Int): String = {
    val alphabet = "abcdefghijklmnopqrstuvwxyz"
    val encryptedWord = word.map { letter =>
        val index = (alphabet.indexOf(letter) + shift) % 26
        alphabet(index)
    }
    encryptedWord.mkString 
}

def decryption(word: String, shift: Int): String = {
    val alphabet = "abcdefghijklmnopqrstuvwxyz"
    val encryptedWord = word.map { letter =>
        val index = (alphabet.indexOf(letter) - shift) % 26
        alphabet(index)
    }
    encryptedWord.mkString 
}