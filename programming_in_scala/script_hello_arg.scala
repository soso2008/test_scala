// $ scala hello_arg.scala planet

println("Hello " + args(0) + "!")

var i = 0 
while (i < args.length) {
    println("args " + i + ": " + args(i))
    i += 1
}

