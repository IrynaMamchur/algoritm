import java.util.Objects;

public class AlgoritmLast {

        // Предположим, у вас есть рюкзак вместимостью 10 кг и список предметов,
        // которые вы можете положить в рюкзак. Каждый предмет имеет свой вес и стоимость
        //Вам нужно выбрать такой набор предметов, чтобы их суммарный вес не превышал 10 кг,
        // а суммарная стоимость была максимальной.
        //Решение задачи о рюкзаке с помощью жадного алгоритма заключается в следующих шагах:
        //Вычисляем "ценность" каждого предмета, разделив его стоимость на вес.
        //Сортируем предметы в порядке убывания их ценности.
        //Идем по отсортированному списку предметов и добавляем их в рюкзак, начиная с самых ценных, пока не достигнем максимальной вместимости рюкзака.
        //22:54

    private int weight;
    private int cost;

    private String name;
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue() {
        this.value = value;
    }

    public AlgoritmLast(int weight, int cost, String name) {
        this.weight = weight;
        this.cost = cost;
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight() {
        this.weight = weight;
    }

    public int getCost() {
        return cost;
    }

    public void setCost() {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AlgoritmLast that = (AlgoritmLast) o;
        return weight == that.weight && cost == that.cost && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, cost, name);
    }

    public int isValue() {
        int value = getCost() / getWeight();
        return value;
    }

    @Override
    public String toString() {
        return "AlgoritmLast{" +
                "weight=" + weight +
                ", cost=" + cost +
                ", name='" + name + '\'' +
                '}';
    }
}

