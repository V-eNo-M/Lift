/**
 * Created by Ivan Shulga on 12.03.2016.
 * ������ 2. �����
* */

public class Solver {

    public static void main(String[] args) {
        Lift my = new Lift();
        my.setPeopleComeIn(5,0,1,0,0);  //��������� ���������� �������� ����� �� ������ �����(���-�� ������ �� ������������)
        my.setPeopleComeOut(2,0,3,2,4); //��������� ���������� �������� ����� �� ������ �����(���-�� ������ �� ������������)
        my.setMaxPeople(10);            //������������ ����� ������� ����������� � ����� ������������.

        my.calcPeople();                //����������� �������� � ������� �� � �������.
    }
}
