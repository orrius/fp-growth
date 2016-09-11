(ns fp-growth.core
  (:gen-class))


(defn generate-data
	[]
	(def create-basket (fn  [] (take (+ (rand-int 4) 1) (repeatedly (fn [] (rand-int 100))))))
	(take 100 (repeatedly create-basket)))

(defn count-and-sort
	[data]
	(reverse (sort-by last (frequencies (apply concat data)))))

(defrecord Node [id set count])

(defn construct-fp-tree
	[data f-list]
	(loop [elements (first data)]
		(let [element (first elements) res (rest elements)]
			(if (empty? element)
				{:id element :set []}
				{:id element :set (recur res)}))))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (def data (generate-data))
  (println data)
  (println (count-and-sort data))
  (def f-list (count-and-sort data))
  (println (construct-fp-tree data f-list)))
