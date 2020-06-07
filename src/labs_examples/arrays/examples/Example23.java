package labs_examples.arrays.examples;

// A simple automated telphone directory.
class Phone {
    public static void main(String args[]) {

        String numbers[][] = {
                { "Tom", "555-3322" },
                { "Mary", "555-8976" },
                { "Jon", "555-1037" },
                { "Rachel", "555-1400" }
        };
        int i;

        if(args.length != 1)
            System.out.println("Usage: java Phone <name>" + args.length);
        else {
            for(i=0; i<numbers.length; i++) {
                if(numbers[i][0].equals(args[0])) {
                    System.out.println(numbers[i][0] + ": " +
                            numbers[i][1]);
                    break;
                }
            }
            if(i == numbers.length)
                System.out.println("Name not found.");
        }
    }
}