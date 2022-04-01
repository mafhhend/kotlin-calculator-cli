import java.lang.Exception

fun main () {
    val loop = 14;
    val numbers = mutableListOf<Int>();
    val op: String;
    println("* * * Calculator * * *");
    print("What's Your Operator ? ");
    op = readLine().toString();
    var step = 1;
    while (true) {
        try {
            println("$step num :");
            val num = readLine();
            numbers.add(num!!.toInt());
            step++;
        } catch (e: Exception) {
            ClearConsole()
            break;
        }
    }
    var calculateNumber = 0;
    when(op){
        "+"->{
            for (item in 0..numbers.size -1) {
                calculateNumber+=numbers[item];
            }
        }
        "-"->{
            for (item in 0..numbers.size -1) {
                calculateNumber-=item;
            }
        }
        "*"->{
            for (item in 0..numbers.size -1) {
                calculateNumber*=item;
            }
        }
        "/"->{
            for (item in 0..numbers.size -1) {
                calculateNumber/=item;
            }
        }
        "%"->{
            for (item in 0..numbers.size -1) {
                calculateNumber%=item;
            }
        }
    }
    println("Value : $calculateNumber")

}