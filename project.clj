(defproject fp-growth "0.1.0-SNAPSHOT"
  :description "Implementation of FP-Growth Algorithm as described by https://en.wikibooks.org/wiki/Data_Mining_Algorithms_In_R/Frequent_Pattern_Mining/The_FP-Growth_Algorithm"
  :url "https://github.com/orrius/fp-growth"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot fp-growth.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
