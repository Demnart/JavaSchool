package Lesson5;

/**
 * Created by Артем on 13.10.2016.
 */
//public abstract class IFly{}
//public interface IFly  КРОВАВЫЙ КОНТРАКТ// НАВЫКИ И СВОЙСТВА
public interface IFly {// интерфейс это абстрактный класс в котором все методы абстрактные.Контракт!Навыки и свойства
//    int count; в интерфейсе невозможно содавать переменные
   final int MAX_COUNT = 120; // Все переменные которым присвоено значение становяться константами!!!
    void fly();
    void landing();
}
