// Groovy program to print the input arguments using loop

class BasicLoops{
    static void main(args){

        assert args.length > 0, "No inputs passed to the function"

        println("for-in loop")
        for(def item in args){
            print(item+ " ")
        }
        println()

        println("c-style for loop")
        for(int i=0; i<args.length; i++){
            print(args[i]+ " ")
        }
        println()

        println("while loop")
        int index = 0
        while(index < args.length){
            print(args[index]+ " ")
            index++
        }
        println()

    }
}
