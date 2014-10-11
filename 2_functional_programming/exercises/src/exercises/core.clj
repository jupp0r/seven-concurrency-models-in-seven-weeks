(ns exercises.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn recursive-sum [numbers]
  (if (empty? numbers)
    0
    (+ (first numbers) (recursive-sum (rest numbers)))
    )
  )

(defn loop-recur-sum [numbers]
  (loop [head (first numbers) tail (rest numbers) acc 0]
    (if (empty? tail)
      (+ head acc)
      (recur (first tail) (rest tail) (+ acc head)))))
