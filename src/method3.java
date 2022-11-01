public class method3 {
    public static void CatatSemuaMember(String [] anggota){
        for (int index=0;index< anggota.length;index++){
            System.out.println(anggota(index));

            String[] member = new String[3];
            member[0] ="budi";
            member[1] ="surya";
            member[2] ="mijun";
            CatatSemuaMember(member);
        }
    }
}
