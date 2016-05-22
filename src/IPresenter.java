/**
 * Created by pkhope on 2016/5/21.
 */
public interface IPresenter {

    void load();

    void save();

    void changeModule(String name);

    void addItem(String name);

    void removeItem(int index);

    void setSelected(int index, boolean selected);

}
