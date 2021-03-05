package ec.edu.espe.prototypevirtualid.model;

import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class TMStudent implements TableModel {

    private List<Student> student;

    public TMStudent(List<Student> list) {
        student = list;
    }

    @Override
    public int getRowCount() {
        return student.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String title = null;

        switch (columnIndex) {
            case 0: {
                title = "Career";
                break;
            }

            case 1: {
                title = "Name";
                break;
            }

            case 2: {
                title = "email";
                break;
            }

            case 3: {
                title = "Address";
                break;
            }

            case 4: {
                title = "Age";
                break;
            }

            case 5: {
                title = "ID";
                break;
            }

            case 6: {
                title = "Gender";
                break;
            }
        }
        return title;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        if (columnIndex == 0) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Student s = student.get(rowIndex);
        String value = null;
        int value1 = 0;

        switch (columnIndex) {
            case 0: {
                value = s.getCareer();
                break;
            }

            case 1: {
                value = s.getName();

                break;
            }

            case 2: {
                value = s.getEmail();
                break;
            }

            case 3: {
                value = s.getAddress();
                break;
            }

            case 4: {
                value = Integer.toString(s.getAge());
                break;
            }

            case 5: {
                value = s.getId();
                break;
            }

            case 6: {
                value = s.getGender();
                break;
            }
        }
        return value;

    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Student s = student.get(rowIndex);
        
        switch (columnIndex) {
            case 0: {
                s.setCareer(aValue.toString());
                break;
            }

            case 1: {
                s.setName(aValue.toString());;

                break;
            }

            case 2: {
                s.setEmail(aValue.toString());
                break;
            }

            case 3: {
                s.setAddress(aValue.toString());
                break;
            }

            case 4: {
                s.setAge(aValue.hashCode());
                break;
            }

            case 5: {
                s.setId(aValue.toString());
                break;
            }

            case 6: {
                s.setGender(aValue.toString());
                break;
            }
        }

    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }

}