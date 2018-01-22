(ns renteblad.abnamro
  (:require [java-time :as t]))

(def renteblad
  [{:datum #inst "2018-01-22"
    :tarieven [:nhg :<=65% :<=85% :>85%]
    :looptijden [:variabel :1 :0+2 :1+2 :5 :6 :5+2 :10 :10+2 :15 :15+2 :20 :25 :30]
    :rente
    [[1.70 1.59 1.59 1.59 1.74 1.84 1.90 2.03 2.30 2.74 2.94 2.99 4.50 4.50]
     [1.70 1.59 1.59 1.59 1.74 1.84 1.90 2.03 2.30 2.74 2.94 2.99 4.50 4.60]
     [1.90 1.79 1.79 1.79 1.94 2.04 2.10 2.23 2.50 2.94 3.14 3.19 4.70 4.80]
     [2.25 2.14 2.14 2.14 2.29 2.39 2.45 2.58 2.85 3.29 3.49 3.54 5.05 5.15]]}

   {:datum #inst "2018-01-01"
    :tarieven [:nhg :<=65% :<=85% :>85%]
    :looptijden [:variabel :1 :0+2 :1+2 :5 :6 :5+2 :10 :10+2 :15 :15+2 :20 :25 :30]
    :rente
    [[1.70 1.59 1.59 1.59 1.69 1.79 1.80 1.88 2.15 2.54 2.69 2.74 4.25 4.35]
     [1.70 1.59 1.59 1.59 1.69 1.79 1.80 1.88 2.15 2.54 2.69 2.74 4.25 4.35]
     [1.90 1.79 1.79 1.79 1.89 1.99 2.00 2.08 2.35 2.74 2.89 2.94 4.45 4.55]
     [2.25 2.14 2.14 2.14 2.24 2.34 2.35 2.43 2.70 3.09 3.24 3.29 4.80 4.90]]}

   {:datum #inst "2017-11-18"
    :tarieven [:nhg :<=65% :<=85% :>85%]
    :looptijden [:variabel :1 :0+2 :1+2 :5 :6 :5+2 :10 :10+2 :15 :15+2 :20 :25 :30]
    :rente
    [[1.80 1.59 1.59 1.59 1.69 1.79 1.84 1.93 2.20 2.59 2.84 2.89 4.25 4.35]
     [1.80 1.59 1.59 1.59 1.69 1.79 1.84 1.93 2.20 2.59 2.84 2.89 4.25 4.35]
     [2.00 1.79 1.79 1.79 1.89 1.99 2.04 2.13 2.40 2.79 3.04 3.09 4.45 4.55]
     [2.35 2.14 2.14 2.14 2.24 2.34 2.39 2.48 2.75 3.14 3.39 3.44 4.80 4.90]]}

   {:datum #inst "2017-10-11"
    :tarieven [:nhg :<=65% :<=85% :>85%]
    :looptijden [:variabel :1 :0+2 :1+2 :5 :6 :5+2 :10 :10+2 :15 :15+2 :20 :25 :30]
    :rente
    [[1.80 1.59 1.59 1.59 1.69 1.79 1.84 1.98 2.25 2.64 2.89 2.99 4.25 4.35]
     [1.75 1.54 1.54 1.54 1.64 1.74 1.79 1.93 2.20 2.59 2.84 2.94 4.20 4.30]
     [1.95 1.74 1.74 1.74 1.84 1.94 1.99 2.13 2.40 2.79 3.04 3.14 4.40 4.50]
     [2.35 2.14 2.14 2.14 2.24 2.34 2.39 2.53 2.80 3.19 3.44 3.54 4.80 4.90]]}

   {:datum #inst "2017-09-28"
    :tarieven [:nhg :<=65% :<=85% :>85%]
    :looptijden [:variabel :1 :0+2 :1+2 :5 :6 :5+2 :10 :10+2 :15 :15+2 :20 :25 :30]
    :rente
    [[1.80 1.59 1.59 1.59 1.69 1.79 1.84 1.93 2.20 2.59 2.84 2.94 4.25 4.35]
     [1.75 1.54 1.54 1.54 1.64 1.74 1.79 1.88 2.15 2.54 2.79 2.89 4.20 4.30]
     [1.95 1.74 1.74 1.74 1.84 1.94 1.99 2.08 2.35 2.74 2.99 3.09 4.40 4.50]
     [2.35 2.14 2.14 2.14 2.24 2.34 2.39 2.48 2.75 3.14 3.39 3.49 4.80 4.90]]}

   {:datum #inst "2017-07-14"
    :tarieven [:nhg :<=65% :<=85% :>85%]
    :looptijden [:variabel :1 :0+2 :1+2 :5 :6 :5+2 :10 :10+2 :15 :15+2 :20 :25 :30]
    :rente
    [[1.95 1.74 1.74 1.74 1.84 1.89 1.94 2.13 2.50 2.70 2.96 3.06 4.05 4.15]
     [1.90 1.69 1.69 1.69 1.79 1.84 1.89 2.08 2.45 2.65 2.91 3.01 4.00 4.10]
     [2.10 1.89 1.89 1.89 1.99 2.04 2.09 2.28 2.65 2.85 3.11 3.21 4.20 4.30]
     [2.50 2.29 2.29 2.29 2.39 2.44 2.49 2.68 3.05 3.25 3.51 3.61 4.60 4.70]]}

   {:datum #inst "2017-07-10"
    :tarieven [:nhg :<=65% :<=85% :>85%]
    :looptijden [:variabel :1 :0+2 :1+2 :5 :6 :5+2 :10 :10+2 :15 :15+2 :20 :25 :30]
    :rente
    [[1.95 1.74 1.74 1.74 1.84 1.89 1.94 2.03 2.40 2.55 2.86 2.96 4.05 4.15]
     [1.90 1.69 1.69 1.69 1.79 1.84 1.89 1.98 2.35 2.50 2.81 2.91 4.00 4.10]
     [2.10 1.89 1.89 1.89 1.99 2.04 2.09 2.18 2.55 2.70 3.01 3.11 4.20 4.30]
     [2.50 2.29 2.29 2.29 2.39 2.44 2.49 2.58 2.95 3.10 3.41 3.51 4.60 4.70]]}

   {:datum #inst "2017-03-01"
    :tarieven [:nhg :<=65% :<=85% :>85%]
    :looptijden [:variabel :1 :0+2 :1+2 :5 :6 :5+2 :10 :10+2 :15 :15+2 :20 :25 :30]
    :rente
    [[1.95 1.74 1.74 1.74 1.79 1.89 1.89 1.99 2.25 2.61 2.76 2.76 3.95 4.05]
     [1.90 1.69 1.69 1.69 1.74 1.84 1.84 1.94 2.20 2.56 2.71 2.71 3.90 4.00]
     [2.10 1.89 1.89 1.89 1.94 2.04 2.04 2.14 2.40 2.76 2.91 2.91 4.10 4.20]
     [2.60 2.39 2.39 2.39 2.44 2.54 2.54 2.64 2.90 3.26 3.41 3.41 4.60 4.70]]}

   {:datum #inst "2017-01-01"
    :tarieven [:nhg :<=65% :<=85% :>85%]
    :looptijden [:variabel :1 :0+2 :1+2 :5 :6 :5+2 :10 :10+2 :15 :15+2 :20 :25 :30]
    :rente
    [[2.05 1.69 1.69 1.69 1.69 1.74 1.74 1.99 2.25 2.61 2.81 2.86 3.95 4.05]
     [2.00 1.64 1.64 1.64 1.64 1.69 1.69 1.94 2.20 2.56 2.76 2.81 3.90 4.00]
     [2.20 1.84 1.84 1.84 1.84 1.89 1.89 2.14 2.40 2.76 2.96 3.01 4.10 4.20]
     [2.70 2.34 2.34 2.34 2.34 2.39 2.39 2.64 2.90 3.26 3.46 3.51 4.60 4.70]]}
   ])

(show :>85% :1+2)
(show :<=85% :1+2)

(defn index-of
 [x coll]
 (first (keep-indexed (fn [i v]
       (when (= v x)
       i))
      coll)))

(defn rente
 [blad tarief looptijd]
 (get-in blad [:rente
    (index-of tarief (:tarieven blad))
    (index-of looptijd (:looptijden blad))]))

(defn historie
  [tarief looptijd]
  (->> renteblad
       (map #(hash-map :datum (t/format (t/instant (:datum )))
                       :rente (rente  tarief looptijd)))
       (sort-by :datum)
       (reverse)))

(defn show
  [tarief looptijd]
  (println (format "=== tarief: %s, looptijd: %s" (name tarief) (name looptijd)))
  (doseq [x (historie tarief looptijd)]
    (println x))
  (println))
