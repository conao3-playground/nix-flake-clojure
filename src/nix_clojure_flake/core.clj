(ns nix-clojure-flake.core
  (:require
   [clojure.tools.logging :as log])
  (:gen-class))

(defn -main
  "The entrypoint."
  [& args]
  (log/info args))