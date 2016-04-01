(ns learn-clojure.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn total-cost
  "return line-item total of the item and quantity provided"
  [item-cost number-of-items]
  (* item-cost number-of-items))

(meta (defn myfn-attr-map {:a 1} []))

(def my-atom (atom 0))

(defn present
  [gift]
  (fn [] gift))

(defn product [coll]
  (if (empty? coll)
    1
    (* (first coll)
       (product (rest coll)))))

(defn singleton? [coll]
  (if (empty? coll)
    false
    (empty? (rest coll))))

(defn my-last [coll]
  (if-not (empty? coll)
    (if (singleton? coll)
      (first coll)
      (my-last (rest coll)))))

(defn max-element [a-seq]
  (if-not (empty? a-seq)
    (if (singleton? a-seq)
      (first a-seq)
    (max (first a-seq)
         (max-element (rest a-seq))))))
