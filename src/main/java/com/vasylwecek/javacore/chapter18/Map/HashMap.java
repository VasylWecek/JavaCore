package chapter18.Map;

import java.util.Map;

/***
 * Хэширование - это процесс преобразования объекта в целочисленную форму,
 * выполняется с помощью метода hashCode().
 *
 * Метод hashCode() используется для получения хэш кода объекта. Метод hashCode()
 * класса Object возвращает ссылку памяти объекта в целочисленной форме
 * (идентификационный хеш (identity hash code)). Сигнатура метода public
 * native hashCode(). Это говорит о том, что метод реализован как нативный,
 * поскольку в java нет какого-то метода позволяющего получить ссылку на
 * объект. Допускается определять собственную реализацию метода hashCode().
 * В классе HashMap метод hashCode() используется для вычисления корзины
 * (bucket) и, следовательно, вычисления индекса.
 *
 *   В классе HashMap метод equals() используется для проверки равенства
 *   ключей. В случае, если ключи равны, метод equals() возвращает true,
 *   иначе false.
 *
 *   Bucket -это единственный элемент массива HashMap. Он используется
 *   для хранения узлов (Nodes). Два или более узла могут иметь один и тот-же bucket.
 *
 *   Вычисление индекса в HashMap: index = hashCode(key) & (-1);
 */
public class HashMap {
    public Iterable<? extends Map.Entry<?, ?>> entrySey() {
        return null;
    }

    static class Key{
        String key;
        Key(String key){
            this.key = key;
        }

        @Override
        public int hashCode(){
            return (int) key.charAt(0);
        }

        @Override
        public boolean equals(Object obj){
            return key.equals(((Key) obj).key);
        }
    }
}
