package InMemoryModel;

import java.security.spec.RSAPrivateCrtKeySpec;
//Интерфейс смены наблюдателя
public interface IModelChangedObserver {
    public void applyUpdateModel();

}
