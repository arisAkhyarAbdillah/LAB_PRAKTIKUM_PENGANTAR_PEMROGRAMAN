class nama{
    public static void main(String[] args) {
        char [] array = {'A','B','C'};
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d%s",(int) array[i],i== array.length -1 ? "" : ",");
        }
        System.out.printf("}");
    }
}